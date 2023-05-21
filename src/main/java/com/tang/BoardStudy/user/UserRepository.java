package com.tang.BoardStudy.user;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;




public interface UserRepository extends JpaRepository<SiteUser, Long> {
	/* List<SiteUser> findByGrade(MemberGrade memberGrade); */
	List<SiteUser> findByUsername(String username);

	Optional<SiteUser> findByusername(String username);
	
}
