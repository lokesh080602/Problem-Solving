package com.ta.livewicketplus.service;

import com.ta.livewicketplus.dto.PlayerDetails;
import com.ta.livewicketplus.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class PlayerDetailsService {

    public void addPlayerDetails(PlayerDetails playerDetails) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(playerDetails);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public PlayerDetails getPlayerDetailsById(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        PlayerDetails playerDetails = null;
        try {
            playerDetails = em.find(PlayerDetails.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return playerDetails;
    }

    public void updatePlayerDetails(PlayerDetails playerDetails) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(playerDetails);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void deletePlayerDetails(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            PlayerDetails playerDetails = em.find(PlayerDetails.class, id);
            if (playerDetails != null) {
                em.remove(playerDetails);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public List<PlayerDetails> getAllPlayerDetails() {
        EntityManager em = JPAUtil.getEntityManager();
        List<PlayerDetails> playerDetailsList = null;
        try {
            playerDetailsList = em.createQuery("SELECT p FROM PlayerDetails p", PlayerDetails.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return playerDetailsList;
    }
}
