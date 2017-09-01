# Release Info for Lightbend Scala Language - Expert (formerly AS Advanced Scala)



## 2.1
### released Apr 7, 2017
| Scala  | Java | Akka  | Akka HTTP | Play  | Lagom  |  Prod Suite |  FDP  |   sbt   | ScalaTest |
|:-------|:-----|:------|:----------|:------|:-------|:------------|:------|:--------|:----------|
| 2.11.8 |8     |       |           |2.5.10 |        |             |       |0.13.13  |3.0.0      |

- Removed **Power of recursion** and **Power of folding** exercises
- Removed the section on **Phantom types** as it deemed too complex as
  an introduction to this topic
- Remove all references and exercise parts on `View Bounds` as these have
  been deprecated and just add clutter to the course
- Various fixes and cleanup in the `TrainDSL` solution code
  - Removal of duplicated implicit conversion `String` => `Station`
  - Fix visibility settings on classes internal to `TrainDSL`: make
    constructor private to `TrainDSL`
- Remove the utilisation of `breakOut` from the solution to one of the
  exercises
- Mark the chapter **Custom Collections** as optional
- Add more slides on the topic of _folding_
- Fix incorrect labeling of `sliding` as a HOF
- Provide an alternative, tail-recursive solution for the group
  exercise **Calculate connections V**

## 2.0.1
### released Feb 22, 2017
| Scala  | Java | Akka  | Akka HTTP | Play  | Lagom  |  Prod Suite |  FDP  |   sbt   | ScalaTest |
|:-------|:-----|:------|:----------|:------|:-------|:------------|:------|:--------|:----------|
| 2.11.8 |8     |       |           |2.5.10 |        |             |       |0.13.13  |3.0.0      |

- Reformat exercise instructions to 80-char limit per line
- Fix typos in exercise instructions
- Fix inconsistenties between exercise instructions and reference solution
  for exercise **Extend My Library**
- Remove instructions to write tests (as these are supplied by default)

## 2.0.0
### released Feb 6, 2017
| Scala  | Java | Akka  | Akka HTTP | Play  | Lagom  |  Prod Suite |  FDP  |   sbt   | ScalaTest |
|:-------|:-----|:------|:----------|:------|:-------|:------------|:------|:--------|:----------|
| 2.11.8 |8     |       |           |2.5.10 |        |             |       |0.13.13  |3.0.0      |

- the main change to v2.0.0 is switch from koan/groll to the new course management system
- this required changes to exercise code and instructions on how to navigate
- also slides have been changed to reflect the new system