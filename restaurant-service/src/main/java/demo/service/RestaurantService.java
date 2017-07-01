package demo.service;

import demo.domain.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by yefeiw on 6/23/17.
 */
public interface RestaurantService {
    Page<Restaurant> findAll(Pageable pageable);

    Restaurant findById(String id);

    Page<Restaurant> findByName(String name, Pageable pageable);

    List<Restaurant> saveRestaurants(List<Restaurant> restaurants);

    void addMenuItem(String id, Request request);

    void deleteById(String id);

    void deleteAll();
//    int update(Restaurant restaurant);
}
