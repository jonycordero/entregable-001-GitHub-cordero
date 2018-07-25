package pe.edu.unsch.entities;
// Generated 25/07/2018 02:02:51 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cuenta generated by hbm2java
 */
@Entity
@Table(name = "cuenta", catalog = "artesaniashop")
public class Cuenta implements java.io.Serializable {

	private int usuario;
	private String nombre;
	private String email;
	private String password;
	private Set<Compra> compras = new HashSet<Compra>(0);

	public Cuenta() {
	}

	public Cuenta(int usuario) {
		this.usuario = usuario;
	}

	public Cuenta(int usuario, String nombre, String email, String password, Set<Compra> compras) {
		this.usuario = usuario;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.compras = compras;
	}

	@Id

	@Column(name = "usuario", unique = true, nullable = false)
	public int getUsuario() {
		return this.usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuenta")
	public Set<Compra> getCompras() {
		return this.compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}

}