package com.example.jpaexamen.infrastructure.controller;

import com.example.jpaexamen.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class UserRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getData(HashMap<String, Object> conditions) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> root = query.from(User.class);
        List<Predicate> predicates = new ArrayList<>();
        conditions.forEach((field, value) ->
        {
            switch (field) {
                case "id":
                    predicates.add(cb.like(root.get(field), "%" + value + "%"));
                    break;
                case "name":
                    predicates.add(cb.like(root.get(field), "%" + value + "%"));
                    break;

                case "fechAlta":
                    String dateCondition = (String) conditions.get("dateCondition");
                    switch (dateCondition) {
                        case "GREATER_THAN":
                            predicates.add(cb.greaterThan(root.<Date>get(field), (Date) value));
                            break;
                        case "LESS_THAN":
                            predicates.add(cb.lessThan(root.<Date>get(field), (Date) value));
                            break;
                        case "EQUAL":
                            predicates.add(cb.equal(root.<Date>get(field), (Date) value));
                            break;
                    }
                    break;
                case "email":
                    predicates.add(cb.like(root.get(field), "%" + value + "%"));
                    break;
                case "categoria":
                    predicates.add(cb.like(root.get(field), "%" + value + "%"));
                    break;
                case "ciudad":
                    predicates.add(cb.like(root.get(field), "%" + value + "%"));
                    break;
                case "comentarios":
                    predicates.add(cb.like(root.get(field), "%" + value + "%"));
                    break;
            }
        });
        query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
        return entityManager.createQuery(query).getResultList();
    }
}

