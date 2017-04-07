package com.edorei.expose.api;

import java.util.List;

public interface ExposeRule<T> {
	public void toExcel(List<T> list,  Class<T> c);
	public void toPdf(List<T> list);
}
