package com.urdomain.ch06;

//@Target({ElementType.METHOD})
//@Retntion(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
