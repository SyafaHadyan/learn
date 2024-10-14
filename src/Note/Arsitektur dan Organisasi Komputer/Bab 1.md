# Bab 1

## Structure and Function

A hierarchical system is a set of interrelated subsystems; each subsystem may, in turn, contain lower level subsystems until the lowest level of elementary subsystem.

> **Structure**: The way in which the components are interrelated.
>
> **Function**: The operation of each individual component as part of the structure.

### Function

There are only four basic functions that a computer can perform:

- **Data Processing**: Data may take a wide variety of forms, and the range of processing requirements is broad.
- **Data Storage**: Computer process data on the fly and at any given moment, the computer must temporarily store those pieces of date that are being worked on and there are a sort-term data storage function and a long-term data storage function.
- **Data Movement**: When data are received from or delivered to a device that is directly connected to the computer, the process is known as *input-output* (I/O), and the device is referred to as *peripheral*. When data are moved over longer distances, to or from a remote device, the process is known as *data communications*.
- **Control**: A control unit manages the computer's resources and performance of its functional parts in response to instructions.

### Structure

#### Simple Single-Processor Computer

![Figure 1.1](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Arsitektur%20dan%20Organisasi%20Komputer/Pictures/Bab%203/Figure1.1.png)
*Figure 1.1 The Computer: Top-Level Structure*

- **Central processing unit (CPU)**: Controls the operation of the computer and performs its data processing functions; ofter simply refered to as **processor**.
- **Main memory** Stores data.
- **I/O** Moves data between the computer and its external environment.
- **System inteconnection**: Some mechanism that provides for communication amoung CPU, main memory, and I/O. A common example is **system bus** consisting of a number of conducting wires to which all the other components attach.

##### CPU Major Structural Components

- **Control unit**: Controls the operation of the CPU and the computer.
- **Arithmetic and logic unit (ALU)**: Performs the computer's data processing functions.
- **Registers**: Provides storage internal to the CPU.
- **CPU interconnection**: Mechanism that provides for communication among the control unit, ALU, and registers.

There are several approaches to the implementation of the control unit; one common approach is a *microprogrammed* implementation. A microprogrammed control unit operates by executing microinstructions that define the functionality of the control unit.

#### Multicore Computer Structure

Each processing unit (consisting of a control unit, ALU, registers, and perhaps cache) is called a *core*.

- **Central processing unit (CPU)**: That portion of a computer that fetches and executes instructions. It consists of an ALU, a control unit, and registers. In a system with a single processing unit, it is often simply referred to as a *processor*.
- **Core**: An individual processing unit on a processor chip. A core may be equivalent in functionality to a CPU on a single-CPU system. Other specialized processing units, such as one optimized for vector and matrix operations, are also referred to as cores.
- **Processor**: A physical piece of silicon containing one or more cores. The processor is the computer component that interprets and executes instructions.

Most cumputers are housed on a motherboard. A **printed circuit board (PCB)** is a rigid, flat board that holds and interconnects chips and other electronic components. The main printed circuit board in a computer is called a system board or **motherboard**, while smaller ones that plug into the slots in the main board are called expansion boards.

![Figure 1.2](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Arsitektur%20dan%20Organisasi%20Komputer/Pictures/Bab%203/Figure1.2.png)
*Figure 1.2 Simplified View of Major Elements of a Multicore Computer*

A **chip** is a single piece of semiconducting material, typically silicon upon which electronic circuits and logic gates are fabricated. The resulting product is referred as an **integrated circuit**.

##### Functional Elements of a Core

- **Instruction logic**: This includes the tasks involved in fetching instructions, and decoding each instruction to determine the instruction operation and the memory locations of any operands.
- **Arithmetic and logic unit (ALU)**: Performs the operation specified by an instruction.
- **Load/store logic**: Manages the transfer of data to and from main memory via cache.
