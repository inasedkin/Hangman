# Hangman

[![Build Status][travis-badge]][travis-url]
[![Coverage][coverage-image]][coverage-url]

**Hangman** is a text-based intellectual game, where you are to guess a random word letter by letter.

MIPT Course on Software Design, Fall 2019.

### Setup

To compile **Hangman** installed [sbt] is required. Once [sbt] is installed, run
```console
user@host:~/Hangman$ sbt run
```
in the root directory of **Hangman**.

[sbt]: https://www.scala-sbt.org/

### Integrations

Project has integrations with [Travic CI] and [CodeCov]. See links and brief information in the header.

[Travic CI]: https://travis-ci.org
[CodeCov]: https://codecov.io

### Static Code Analysis

Static code analysis may be done with [Scalastyle] in the root directory of **Hangman**:

```console
user@host:~/Hangman$ sbt scalastyleGenerateConfig scalastyle
```

[Scalastyle]: http://www.scalastyle.org/

### Copyright

Copyright © 2019 [Ivan Nasedkin]. See [license] for details.

[Ivan Nasedkin]: https://github.com/inasedkin
[license]: LICENSE

[travis-url]: https://travis-ci.com/inasedkin/Hangman
[travis-badge]: https://travis-ci.com/inasedkin/Hangman.svg?branch=master
[coverage-image]: https://codecov.io/gh/inasedkin/Hangman/branch/master/graph/badge.svg
[coverage-url]: https://codecov.io/gh/inasedkin/Hangman/