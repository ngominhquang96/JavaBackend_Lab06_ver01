package model;

import exception.InvalidValueException;

public interface IEmployee {
	void inputData() throws InvalidValueException;
	void showData();
	float income();

}
