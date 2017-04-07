package com.edorei.expose.api;

import java.util.List;

public interface ExposeRule<T> {
	public void toExcel(List<T> list);
	public void toPdf(List<T> list);
}
