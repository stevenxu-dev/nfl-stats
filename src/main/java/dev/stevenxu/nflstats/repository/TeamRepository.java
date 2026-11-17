package dev.stevenxu.nflstats.repository;

import dev.stevenxu.nflstats.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {

}
