package com.arranger.eurekaclient.repository;

import com.arranger.eurekaclient.entity.Logs;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LogsRepository extends JpaRepository<Logs, String> {
    Logs getLogsByPermutationId(String permutationId);
    Optional<List<Logs>> getLogsByUserId(String userId, Pageable pageable);
}
