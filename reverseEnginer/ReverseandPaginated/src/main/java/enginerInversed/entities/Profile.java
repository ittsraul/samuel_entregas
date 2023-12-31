// default package
// Generated 26 nov 2023 19:40:10 by Hibernate Tools 5.2.13.Final
package enginerinversed.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Profile generated by hbm2java
 */
@Entity
@Table(name = "Profile", catalog = "kurigram")
public class Profile implements java.io.Serializable {

	private Long id;
	private User user;
	private String bio;

	public Profile() {
	}

	public Profile(User user, String bio) {
		this.user = user;
		this.bio = bio;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "bio", length = 50)
	public String getBio() {
		return this.bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

}
