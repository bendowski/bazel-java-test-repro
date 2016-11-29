# Bazel's java_test playground

Shows that without extra steps, like having a runtime dependency on JUnit,
classes bundled with Bazel's JUnit test runner take precendence over explicitly
specified dependencies.

In this case `:test` fails, but `:test_with_runtime_deps` runs fine.
