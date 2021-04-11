package sample.core.annotations;

// https://www.youtube.com/watch?v=9BbxPd3GPeU

import java.lang.annotation.*;

@Documented // �������� � javadoc
@Inherited // ����������� ��������� ������
@Target (ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service{
	String name();
	boolean lazyLoad() default false;
}

