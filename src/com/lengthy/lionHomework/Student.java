package com.lengthy.lionHomework;

    public class Student extends Person implements Learner {
        double totalStudyTime;

        public Student(double totalStudyTime) {
            super ( 2216, "Shishonah" );
            this.totalStudyTime = totalStudyTime;

        }

        public double getTotalStudytime(){
            return totalStudyTime;
        }

        @Override
        public void learn(double numberOfHours) {
            totalStudyTime= totalStudyTime + numberOfHours;

        }

        @Override
        public double getTotalStudyTime() {
            return 0;
        }
}
