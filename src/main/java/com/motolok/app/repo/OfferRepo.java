package com.motolok.app.repo;

import com.motolok.app.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by markul on 29.08.2017.
 */
public interface OfferRepo extends JpaRepository<Offer,Long> {
}
