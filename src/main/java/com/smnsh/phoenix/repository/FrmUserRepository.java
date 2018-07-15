package com.smnsh.phoenix.repository;

import com.smnsh.phoenix.entity.FrmUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrmUserRepository extends JpaRepository<FrmUser, Long> {
}
