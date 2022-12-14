package com.ll.exam.app__2022_10_12.app.member.repository;

import com.ll.exam.app__2022_10_12.app.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}