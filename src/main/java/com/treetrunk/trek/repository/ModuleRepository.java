package com.treetrunk.trek.repository;

import com.treetrunk.trek.model.module.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, Long> {
}