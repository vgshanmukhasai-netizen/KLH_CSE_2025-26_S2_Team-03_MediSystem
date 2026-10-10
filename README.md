# DSA-3 MediSearch Project

## 🏥 Project Overview

MediSearch is a healthcare-oriented patient information searching system developed as part of the Data Structures and Algorithms (DSA-3) project. The project focuses on searching patient records efficiently using advanced string-matching algorithms and data structures.

The system maintains a patient dataset and allows users to search for relevant patient information using different algorithms. It demonstrates how data structures and algorithms can improve the efficiency of searching large collections of medical records.

## 🎯 Objectives

- Develop an efficient patient information searching system.
- Implement and compare multiple string-matching algorithms.
- Apply advanced data structures to healthcare information retrieval.
- Analyze the performance of different searching techniques.
- Reduce the time required to find relevant patient records.
- Understand the practical applications of DSA concepts.

## ✨ Features

- Patient record management and retrieval.
- Text-based searching across patient records.
- Exact pattern matching.
- Efficient searching using advanced algorithms.
- Approximate string matching for handling spelling differences.
- Comparison of algorithm performance.
- Organized patient corpus for testing and evaluation.

## 🧠 Algorithms Implemented

The project explores the following algorithms:

1. **Knuth-Morris-Pratt (KMP)** – Uses a prefix table to avoid unnecessary character comparisons.
2. **Z Algorithm** – Uses the Z-array to identify pattern matches efficiently.
3. **Trie** – Organizes strings in a tree structure for prefix-based searching.
4. **Aho-Corasick Algorithm** – Searches for multiple patterns in text simultaneously.
5. **Edit Distance** – Measures the minimum number of insertions, deletions, and substitutions required to transform one string into another.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Data Structures:** Trees, Tries, Arrays, and Strings
- **Algorithms:** KMP, Z Algorithm, Aho-Corasick, and Edit Distance
- **Development Environment:** Visual Studio Code
- **Dataset Format:** Text files and Excel datasets

## 📂 Project Structure

The project is organized into modules for patient data handling, corpus loading, and algorithm-based searching.

```text
DSA-3-MediSearch-Project/
│
├── src/
│   ├── Patient.java
│   ├── CorpusLoader.java
│   ├── KMP.java
│   ├── ZAlgorithm.java
│   ├── Trie.java
│   ├── AhoCorasick.java
│   └── EditDistance.java
│
├── corpus_txt/
│   ├── patient1.txt
│   ├── patient2.txt
│   └── ...
│
├── datasets/
│   ├── MediSearch_Final_30_Patients.xlsx
│   ├── MediSearch_100_Patient_Dataset.xlsx
│   └── MediSearch_Mild_Serious_Health_100_Patients.xlsx
│
└── README.md
