/**
 * 
 */
package dig.ved.java8.newfeatures.repeatable;

/**
 * @author vedbhasker.t
 *
 */

// Repeating annotation
@Types(genere = "90's", mood = "sooting")
@Types(genere = "gazals", mood = "Jagjeet Singh")
@Types(genere = "motivational", mood = "sports songs")
public class RepeatablesAnnotationExample {

	public static void main(String[] args) {

		// Getting annotation by type into an array
		Types[] musicType = RepeatablesAnnotationExample.class.getAnnotationsByType(Types.class);

		for (Types types : musicType) {
			System.out.println("music genere=" + types.genere() + " --- music mood=" + types.mood());
		}

	}

}
