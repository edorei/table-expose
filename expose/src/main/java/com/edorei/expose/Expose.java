package com.edorei.expose;

import java.lang.reflect.Field;
import java.util.List;

import com.edorei.expose.annotation.ExposeField;
import com.edorei.expose.api.ExposeRule;
import com.edorei.expose.exception.NoContentProvidedException;

public class Expose<T> implements ExposeRule<T>{
	
	@Override
	public void toExcel(List<T> list, Class<T> c){
		try{
			if(list==null || list.isEmpty()){
				throw new NoContentProvidedException("No content provided");
			}else{
				T t = c.newInstance();
				Field[] field = t.getClass().getDeclaredFields();
				for (Field f : field) {
					System.out.println(f.getName());
					if(f.isAnnotationPresent(ExposeField.class)){
						ExposeField anotation = f.getAnnotation(ExposeField.class);
						System.out.println(anotation.name());
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		        
    }

	@Override
	public void toPdf(List<T> list) {
		
	}
}
