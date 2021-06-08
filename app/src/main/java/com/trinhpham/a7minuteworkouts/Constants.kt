package com.trinhpham.a7minuteworkouts

class Constants {
    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModel>{
            val exerciseList = ArrayList<ExerciseModel>()

            val jumpingJacks = ExerciseModel(1, "Jumping Jacks",
                R.drawable.ic_jumping_jack2, false, false)
            exerciseList.add(jumpingJacks)

            val wallSit = ExerciseModel(2, "Wall Sit",
                R.drawable.ic_wallsit, false, false)
            exerciseList.add(wallSit)

            val pushUp = ExerciseModel(3, "Push Up",
                R.drawable.ic_pushup, false, false)
            exerciseList.add(pushUp)

            val abdominalCrunch = ExerciseModel(4, "Abdominal Crunch",
                R.drawable.ic_abdominalccrunch, false, false)
            exerciseList.add(abdominalCrunch)

            val stepUpOnChair = ExerciseModel(5, "Step-Up onto Chair",
                R.drawable.ic_stepup, false, false)
            exerciseList.add(stepUpOnChair)

            val squat = ExerciseModel(6, "Squat",
                R.drawable.ic_squat, false, false)
            exerciseList.add(squat)

            val tricepDipOnChair = ExerciseModel(7, "Tricep Dip On Chair",
                R.drawable.ic_tricepdip, false, false)
            exerciseList.add(tricepDipOnChair)

            val plank = ExerciseModel(8, "Plank",
                R.drawable.ic_plank, false, false)
            exerciseList.add(plank)

            val highKneesRunningInPlace = ExerciseModel(9, "High Knees Running In Place",
                R.drawable.ic_highknees, false, false)
            exerciseList.add(highKneesRunningInPlace)

            val lunges = ExerciseModel(10, "Lunges",
                R.drawable.ic_lunge, false, false)
            exerciseList.add(lunges)

            val pushupAndRotation = ExerciseModel(11, "Push up and Rotation",
                R.drawable.ic_pushuprotation, false, false)
            exerciseList.add(pushupAndRotation)

            val sidePlank = ExerciseModel(12, "Side Plank",
                R.drawable.ic_sideplank, false, false)
            exerciseList.add(sidePlank)

            return exerciseList
        }
    }
}