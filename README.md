
# Handwritten Text Recognition with TensorFlow

This repository contains code samples for on ["Handwritten Text Recognition with TensorFlow"](https://github.com/githubharald/SimpleHTR).
The code is written using Python. The program `src/main.py` uses Tensorflow, and OpenCV
libraries. It needs modification for compatibility with other applications and new datasets.

Handwritten Text Recognition (HTR) system implemented with TensorFlow (TF) and trained on the IAM off-line HTR dataset.
This Neural Network (NN) model recognizes the text contained in the images of segmented words as shown in the illustration below.

![htr](./SimpleHTR/doc/htr.png)


## Command line arguments

* `--train`: train the NN, details see below.
* `--validate`: validate the NN, details see below.
* `--beamsearch`: use vanilla beam search decoding (better, but slower) instead of best path decoding.
* `--wordbeamsearch`: use word beam search decoding (only outputs words contained in a dictionary) instead of best path decoding. This is a custom TF operation and must be compiled from source, more information see corresponding section below. It should **not** be used when training the NN.

## Requirements
* python                    3.5.5
* numpy                     1.15.2 
* opencv-python             4.0.0.21
* tensorflow                1.13.1
* editdistance              0.5.3
* Keras-Applications        1.0.7      
* Keras-Preprocessing       1.0.9

## Setup the Environment
1. conda create -n DNN python=3.5
2. source activate DNN
3. conda install pandas numpy scipy jupyter cython 
3. pip install tensorflow 
4. pip install opencv-python
5. pip install editdistance

## Datasets
### IAM dataset
The data-loader expects the IAM dataset \[\3]. 
The model can work with other type of datasets as well. Either convert your dataset to the IAM format (look at words.txt and the corresponding directory structure) or necessary modifications to the class DataLoader will be necessary according to your dataset format. 

## Model Overview
We use a NN for our task. It consists of convolutional NN (CNN) layers, recurrent NN (RNN) layers and a final Connectionist Temporal Classification (CTC) layer. 
The following Fig shows an overview of our HTR system.

![model](./SimpleHTR/doc/nn_overview.png)

The NN written as a mathematical function which maps an image M to a character sequence (c1, c2, …).

![equation](./SimpleHTR/doc/eq.png)

### Operations
**CNN**: the input image is fed into the CNN layers. The network outputs a feature map (or sequence) has a size of 32×256.
**RNN**: the feature sequence contains 256 features per time-step, the RNN propagates relevant information through this sequence. The RNN output sequence is mapped to a matrix of size 32×80.<br />
**CTC**: while training the NN, the CTC is given the RNN output matrix and the ground truth text and it computes the **loss value**. 

## References
\[1\] [Handwritten Text Recognition with TensorFlow](https://github.com/githubharald/SimpleHTR)

\[2\] [Build a Handwritten Text Recognition System using TensorFlow](https://towardsdatascience.com/2326a3487cd5)

\[3\] [Marti - The IAM-database: an English sentence database for offline handwriting recognition](http://www.fki.inf.unibe.ch/databases/iam-handwriting-database)

## License

MIT License

Copyright (c) 2012-2018 Michael Nielsen

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
