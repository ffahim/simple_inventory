package app.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.jwt.domain.AppUser;

/**
 * @author Sarath Muraleedharan
 *
 */
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findOneByUsername(String username);
}
