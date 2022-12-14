package br.com.pb.barbershop.msuser.application.out;

import br.com.pb.barbershop.msuser.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
