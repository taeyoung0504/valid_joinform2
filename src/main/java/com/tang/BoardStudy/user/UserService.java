package com.tang.BoardStudy.user;




import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    public SiteUser create(String username, String email, String password ) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);
 
        user.setPassword(passwordEncoder.encode(password));
        
      
        
        this.userRepository.save(user);
        
        return user;
    }
    
    public List<SiteUser> checkUsername(String username) {
    	return userRepository.findByUsername(username);
    }
    /*
    public List<SiteUser> findGrade(MemberGrade grade){
    	return userRepository.findByGrade(grade);
    }
*/
}