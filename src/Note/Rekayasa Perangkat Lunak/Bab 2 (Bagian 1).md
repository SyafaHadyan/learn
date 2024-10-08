# BAB 2 PROSES PERANGKAT LUNAK DAN MODEL SDLC (BAG. 1)

## Proses perangkat lunak (software process)

- Software Specification
- Software Development
- Software Validation
- Software Evolution

### Software Specification

Software specification (requirements engineering) is the process of understanding and defining what **services** are required from the system and identifying the **constraints** on the system’s operation and development.

Software specification focuses on **WHAT TO BUILD**.

Phases/activities:

- Requirements elicitation and analysis
- Requirements specification
- Requirements validation

Specification role: software analyst

### Software Validation

Software validation or, more generally, verification and validation (V & V) is the process of showing that a system both conforms to its specification and meets the expectations of the system customer.

Software validation focuses on **FINDING BUGS AND ERRORS**.

Strategies/stages:

- Unit testing
- Integration testing
- Validation/requirements testing

Techniques:

- Black box testing
- White box testing

Software validator role: software tester

### Software Evolution

Software evolution (software maintenance) is the process of changing software over its lifetime after delivery in response to the evolving requirements and customer needs.

Evolution roles: software analyst, software designer, software programmer, software testing.

## Software Development Life Cycle (SDLC)

SDLC is a series of phases that provide a common understanding of the software-building process.

SDLC model is a simplified representation of a software process.

Each model represents a process from a particular perspective (context).

### Waterfall

![Waterfall](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%202/Waterfall.png)

- Introduced by Royce (1970).
- Interaction between subsequent phases -> next phase begins once the previous phase is complete.
- Quality must be assessed and controlled in all phases
- Each phase has specific deliverables

#### Kelebihan Waterfall

- Easy to understand, easy to use.
- Sets requirements stability.
- Every phase needs to be checked and signed off -> eliminates midstream changes.
- Good when quality requirements dominate cost and schedule requirements.
- Good for control (plan, staff, track).

#### Kekurangan Waterfall

- All requirements must be known upfront.
- Deliverables created for each phase are considered frozen - inhibits flexibility.
- Clients not being able to see the product until it is completely finished.
- Difficult to respond to changes.
- Written specs are often difficult for users to read.

#### Menerapkan Waterfall Bila

- Requirements are complete and very well-known.
- Product definition is stable.
- Technology is understood.
- The project is large, expensive, and complicated.

### V

![V](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%202/V.png)

- Extension of the waterfall model -> separation between development and validation & verification (V&V) phases.
- Emphasizing more on V&V phases -> broken down into unit, integration, and system testings.
- Each V&V phase results must be compared to each corresponding development phase.
- Each phase has specific deliverables.

#### Kelebihan V

- Easy to understand, easy to use.
- Increased quality.
- Higher chance of success over the waterfall model due to the development of test plans early on during the life cycle, e.g. unit test is planned during detail design phase.

#### Kekurangan V

- All requirements are known up-front.
- Inflexible, like waterfall model.
- Clients not being able to see the product until it is completely finished.
- More time and resources.

#### Menerapkan V Bila

- Requirements are complete and very well known.
- Product definition is stable.
- Technology is understood.
- Project is large, expensive, complicated.

### Prototyping

![Prototyping](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%202/Prototyping.png)

- Refers to the activity of creating prototypes of software applications.
- Can be throwaway (rarely used) or evolutionary prototyping.
- Users are intensively involved in defining prototypes.
- Once the final prototype is developed, the requirement is considered to be frozen.

#### Kelebihan Prototyping

- Learning by doing -> requirements are partially known.
- Improved and increased user involvement.
- Feedback loop is established.
- A more accurate end product -> reduces maintenance costs.

#### Kekurangan Prototyping

- Insufficient analysis -> user confusion of prototype and final system.
- Lack of project control and standards possible -> potential scope creep.
- Additional expense for building prototype.
- Focus on user-friendly interface -> expense of machine efficiency.

#### Menerapkan Prototyping Bila

- User is not fully knowledgeable.
- Project objectives are unclear.
- Requirements are incomplete and unclear.
- Team members are experienced.
- Pressure of immediate implementation of something.
- System has user interactions.
- Can be adopted in other SDLC models, especially the throwaway prototyping.

### Spiral

![Spiral](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%202/Spiral.png)

- Introduced by Boehm (1988).
- Combining the features of prototyping and waterfall models.
- Starts with basic and clear functionality and work.
- Increments into the final complete product.

#### Kelebihan Spiral

- Increased quality.
- Provides early indication of insurmountable risks, without much cost -> less risks.
- At least as much management control as waterfall (checkpoints) per cycle.
- Early and frequent feedback from users.

#### Kekurangan Spiral

- The model is complex -> complicated.
- May be hard to define objective, verifiable milestones that indicate readiness to proceed through the next iteration -> requires conscientious, attentive management.
- High cost and time to reach the final product.
- Risk assessment expertise is required.
- Spiral may continue indefinetely.


#### Menerapkan Spiral Bila

- Requirements are incomplete but clear.
- Project is large and expensive with high risk (mission-critical projects).
