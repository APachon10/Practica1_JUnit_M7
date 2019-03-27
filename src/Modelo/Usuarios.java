package Modelo;

import java.util.ArrayList;

import Pruebas.test_Usuarios;

public class Usuarios {
	private String name,surname1,surname2,Email,username;
	public static ArrayList<Usuarios> users;
	//Constructores
	public Usuarios() {
	
	}
	public Usuarios(String name, String surname1, String surname2, String email, String username) {
		super();
		this.name = name;
		this.surname1 = surname1;
		this.surname2 = surname2;
		this.Email = email;
		this.username = username;
	}
	//Getters && SETTERS
	public String getName() {
		return name;
	}
	public static ArrayList<Usuarios> getUsers() {
		return users;
	}
	public static void setUsers(ArrayList<Usuarios> users) {
		Usuarios.users = users;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname1() {
		return surname1;
	}
	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}
	public String getSurname2() {
		return surname2;
	}
	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Usuarios [name=" + name + ", surname1=" + surname1 + ", surname2=" + surname2 + ", Email=" + Email
				+ ", username=" + username + "]";
	}
}
