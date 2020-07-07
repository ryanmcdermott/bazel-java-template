# bazel-java-template

## What is this?

This project is a simple starter template for a Java project that uses the [Bazel build system](https://www.bazel.build/).

## Installation

First, ensure that you have [installed Bazel](https://docs.bazel.build/versions/3.2.0/install.html). Then run the following:

```
export JAVA_HOME="$(dirname $(dirname $(realpath $(which javac))))"
git clone https://github.com/ryanmcdermott/bazel-java-template
```

## Running

### Main

```
bazel run :template_bin
```

### Tests

```
bazel test :template_lib_test
```
