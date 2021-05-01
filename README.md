KASH
====
This is a pet project to learn the basics on Kotlin and Blockchain technology.

## Motivation
I have been on a Management position for quite a bit now and I want to code again.
I decided to start a project from scratch mixing Kotlin and Blockchain. Reasons?
- Kotlin: I want to get my hands dirty with Kotlin because I am coming from Java and I haven't fallen in love with it yet. I find it quite difficult to follow during some code-reviews at work and I have the impression that it might be because I haven't worked directly with it very much.
- Blockchain: I think I kind of grasp the general idea but I want to see how further I can implement my own "blockchain-wannabe".

## Technologies
* Language: Kotlin
* Frameworks/Libraries:
	* Spring boot

## What are we doing?
Good question! But you won't like the answer: I do not know.
First I need to understand better what are all the "components" involved in a so-called "Blockchain".
Obviously there is a mining program, people running it (miners), there's also a blockchain and there are wallets. How do all of these connect?
The main concept beneath all of these components is "node".
There can be many different types of nodes, but let's ignore all of them except from one that we will call "full-node".
This full-node will be able to:
- Allow for adding new data (transactions?)
- Generate a new block (aka mining)
- Register/Connect to other nodes
- Synchronize with all the other nodes to have the most up-to-date data.

Depending on the usage of the blockchain some feature will be more interesting than others.
For example, from a Miner perspective only the "mining and synchronizing" operations are relevant.
As well as from a Wallet perspective only the "adding data and synchronizing" operations are.

Regarding the Blockchain itself it is a chain of blocks (as the name implies :facepalm:).
A block is basically a chunk of data. For Bitcoin, for instance, the data which the block contains are "transactions".

[ongoing]
Ongoing questions:
- How does mining work? Proof of work and incentives.
- How are other nodes initially found? In Bitcoin: DNS, Previous list, Hardcoded nodes
- Is new data (new transactions) synchronized continuously? How is the order in this data kept? Does it matter?
- How do miners know when a "block-worth-of-data" is available?

## TODO
* [X] Initialize a Spring Boot app
	* [Issue] JRE != JDK. Got some error when running `./mvnw install` related to a mismatch between the Java Runtime and Java SDK. Fixde by installing `default-jdk` package. "Esto con docker no pasa" :P
* [X] Add sample REST controller: `DemoController`
* [ ] Understand all the parts involved in a Blockchain - **ongoing**
* [ ] Document all the parts involved in simple terms
* [ ] Define REST API to interact with blockchain
* [ ] Create in-memory blockchain