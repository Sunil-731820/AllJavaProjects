package com.java.jsf.moreExample;

import javax.faces.bean.ManagedBean;

import javax.faces.event.ActionEvent;

 

@ManagedBean

public class LikeDisLikeBean {

        private static int likeCount;

        private static int disLikeCount;

        public int getLikeCount() {

                return likeCount;

        }

 

        public void setLikeCount(int likeCount) {

                this.likeCount = likeCount;

        }

        public int getDisLikeCount() {

                return disLikeCount;

        }

 

        public void setDisLikeCount(int disLikeCount) {

                this.disLikeCount = disLikeCount;

        }

 

        public void likeCounter(ActionEvent ae) {

                System.out.println("Inside likeCounter() Method******************");

                likeCount=likeCount+1;

       

        }

        public void disLikeCounter(ActionEvent ae) {

                System.out.println("Inside disLikeCounter() Method******************");

                disLikeCount=disLikeCount+1;

        }

}