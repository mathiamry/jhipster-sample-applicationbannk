package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Administrator;
import com.mycompany.myapp.repository.AdministratorRepository;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Administrator}.
 */
@Service
@Transactional
public class AdministratorService {

    private final Logger log = LoggerFactory.getLogger(AdministratorService.class);

    private final AdministratorRepository administratorRepository;

    public AdministratorService(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }

    /**
     * Save a administrator.
     *
     * @param administrator the entity to save.
     * @return the persisted entity.
     */
    public Administrator save(Administrator administrator) {
        log.debug("Request to save Administrator : {}", administrator);
        return administratorRepository.save(administrator);
    }

    /**
     * Partially update a administrator.
     *
     * @param administrator the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<Administrator> partialUpdate(Administrator administrator) {
        log.debug("Request to partially update Administrator : {}", administrator);

        return administratorRepository
            .findById(administrator.getId())
            .map(existingAdministrator -> {
                if (administrator.getJobTitle() != null) {
                    existingAdministrator.setJobTitle(administrator.getJobTitle());
                }
                if (administrator.getDescription() != null) {
                    existingAdministrator.setDescription(administrator.getDescription());
                }

                return existingAdministrator;
            })
            .map(administratorRepository::save);
    }

    /**
     * Get all the administrators.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<Administrator> findAll() {
        log.debug("Request to get all Administrators");
        return administratorRepository.findAll();
    }

    /**
     * Get one administrator by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Administrator> findOne(Long id) {
        log.debug("Request to get Administrator : {}", id);
        return administratorRepository.findById(id);
    }

    /**
     * Delete the administrator by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Administrator : {}", id);
        administratorRepository.deleteById(id);
    }
}
