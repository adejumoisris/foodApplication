package com.example.foodApplication.reviews.repository;

import com.stripe.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {

    List<Review> findByMenuIdOrderByIdDesc(Long menuId);
    @Query("select avg (r.rating) from  Reviews r where r.menu.id = :menuid")
    Double calculateAverageRatingByMenuId(@Param("menuId") Long menuId);

    @Query("select  case  when  count(r) > 0 then true else false end " +
            "from Reviews r " +
            "where r.user.id= :userId and r.menu.id = :menuId and r.orderId= :orderId")
    boolean existsByUserIdAndMenuIdAndOrderId(
            @Param("userid") Long userId,
            @Param("menuId") Long menuId,
            @Param("orderId") Long orderId);
}
