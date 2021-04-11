package sample.core.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited // Наследуется потомками класса
public @interface Init {
	boolean suppressException() default false;

}
