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

![Figure 1.1](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Arsitektur%20dan%20Organisasi%20Komputer/Pictures/Bab%201/Figure1.1.png)

Figure 1.1 The Computer: Top-Level Structure

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

![Figure 1.2](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Arsitektur%20dan%20Organisasi%20Komputer/Pictures/Bab%201/Figure1.2.png)

Figure 1.2 Simplified View of Major Elements of a Multicore Computer

A **chip** is a single piece of semiconducting material, typically silicon upon which electronic circuits and logic gates are fabricated. The resulting product is referred as an **integrated circuit**.

##### Functional Elements of a Core

- **Instruction logic**: This includes the tasks involved in fetching instructions, and decoding each instruction to determine the instruction operation and the memory locations of any operands.
- **Arithmetic and logic unit (ALU)**: Performs the operation specified by an instruction.
- **Load/store logic**: Manages the transfer of data to and from main memory via cache.

##### Hierarchical Structure of Computers (Example for Motherboard with Two Intel Quad-Core Xeon Processors)

- **PCI-Express** slots for a high-end display adapter and for additional peripherals.
- **Ethernet controller** and **Ethernet ports** for network connections.
- **USB** sockets for peripheral devices.
- **Serial ATA (SATA)** sockets for connection to disk memory.
- **Interfaces for DDR** (double data rate) main memory chips.
- **Intel 3240** chipset is an I/O controller for direct memory access operations between peripheral devices and main memory.

## The IAS Computer

![Figure 1.6](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Arsitektur%20dan%20Organisasi%20Komputer/Pictures/Bab%201/Figure1.6.png)

Figure 1.6 IAS Structure

- A **main memory**, which stores both data and instructions.
- An **arithmetic and logic unit (ALU)**, which interprets the instructions in memory and causes them to be executed.
- **Input-output(I/O)** equipment operated by the control unit.

The memory of the IAS consists of 4096 storage locations, called *words*, of 40 binary digits (bits) each. Both data and instructions are stored there. Numbers are represented in binary form, and each instruction is a binary code. Each number is represented bya sign bit and a 39-bit value. A word may alternatively contain two 20-bit instructions, with each instruction consisting of an 8-bit operation code (opcode) specifying the operation to be performed and a 12-bit address designating one of the words in memory (numbered from 0 to 999).

![Figure 1.7](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Arsitektur%20dan%20Organisasi%20Komputer/Pictures/Bab%201/Figure1.7.png)

Figure 1.7 IAS Memory Formats

The control unit operates the IAS by fetching instructions from memory and executing them one at a time. Both the control unit and the ALU contain storage locations, called *registers*, defined as follows:

- **Memory buffer register (MBR)**: Contains a word to be stored in memory or sent to the I/O unit, or is used to receive a word form memory or from the I/O unit.
- **Memory address register(MAR)**: Specifies the address in memory of the owrd to be written from or read into the MBR.
- **Instruction register (IR)**: Contains the 8-bit opcode instruction being executed.
- **Instruction buffer re   gister (IBR)**: employed to hold temporarily the right-hand instruction from a word in memory.
- **Program counter (PC)**: Contains the address of the next instruction pair to be fetched from memory.
- **Accumulator (AC) and multiplier quotient (MQ)**: Employed to hold temporarily operands and results of ALU operations.

The IAS operates by repetitively performing an *instruction cycle*. Each instruction cycle consists of two subcycles. During the *fetch cycle*, the opcode of the next instruction is loaded into the IR and the address portion is loaded into the MAR. This instruction may be taken from the IBR, or it can be obtained from memory by loading a word into the MBR, and then down to the IBR, IR, and MAR.

The IAS had a total of 21 instructions.

- **Data transfer**: Move data between memory and ALU registers or between two ALU registers.
- **Unconditional branch**: Normally, the control unit executes instructions in sequence from memory. This sequence can be changed by a branch instruction, which facilitates repetitive operations.
- **Conditional branch**: The branch can be made dependent on a condition, thus allowing decision points.
- **Arithmetic**: Operations performed by the ALU.
- **Address modify**: Permits addresses to be computed in the ALU and then inserted into isntructions stored in memory. This allows program considerable addressing flexibility.

## Gates, Memory Cells, Chips, and Multichip Modules

### Gates and Memory Cells

Only two fundamental types of components are required to fulfill basic elements of a digital computer. A **gate** is a device that implements a simple Boolean or logical function. Such device are called gates becouse they control data flow. For example, an AND gate with inputs *A* and *B* and output *C* implements the expression IF *A* AND *B* ARE TRUE THEN *C* IS TRUE The **memory cell** is a device that can store one bit of data. The device can be in one of two stable states at any time.

#### Basic Functions

- **Data storage**: Provided by memory cells.
- **Data processing**: Provided by gates.
- **Data movement**: The paths among components are used to move data from memory to memory and from memory through gates to memory.

  Example: a gate will have one or two data inputs plus a control signal input that activates the gate. When the control signal is ON, the gate performs its function on the data inputs and produces a data output. Conversely, when the control signal is OFF, the output line is null, such as is produced by a high impedance state. Similarly, the memory cell will store the bit that is on its input lead when the WRITE control signal is ON and will place the bit that is in the cell on its output lead when the READ control signal is ON.

![Figure 1.9](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Arsitektur%20dan%20Organisasi%20Komputer/Pictures/Bab%201/Figure1.9.png)

Figure 1.9 Fundamental Computer Elements

### Transistors

Transistors are the fundamental building blocks of digital circuits used in processors, memories, and other digital logic devices. Made of semiconductor materials like silicon, transistors can change their electrical state when voltage is applied. Initially, electronic equipment in the 1950s and 60s was made up of discrete components, which were separate, packaged, and manually assembled on circuit boards. This process was costly and cumbersome, especially as the number of transistors in computers grew which makes the manufacture of newer, more powerful machines increasingly difficult.

### Microelectronic Chips

Components as transistors, resistors, and conductors can be fabricated from a semiconductor such as silicon instead of assembling discrete components made form separate pieces of silicon into the same circuit. Many transistors can be produced at the same time on a single wafer of silicon. These transistors can be connected with a process of metalizaiton to form circuits.

![Figure 1.10](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Arsitektur%20dan%20Organisasi%20Komputer/Pictures/Bab%201/Figure1.10.png)

Figure 1.10 Relationsihp among Wafer, Chip, and Gate
