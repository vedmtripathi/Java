/**
 * 
 */
package dig.ved.java8.newfeatures.repeatable;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author vedbhasker.t
 *
 */

//Declaring container for repeatable annotation type  
@Retention(RetentionPolicy.RUNTIME)
@interface Music {
	Types[] value();

}

//Declaring repeatable annotation type  
@Repeatable(Music.class)
@interface Types{
	
	String genere();
	String mood();
}
