java_import(
    name = "junit-4.12",
    jars = ["junit-4.12.jar"],
)

java_library(
    name = "library",
    srcs = glob(["src/main/java/**/*.java"]),
    deps = [":junit-4.12"],
)

java_test(
    name = "test",
    srcs = glob(["src/test/java/**/*.java"]),
    test_class = "com.example.UseJunit412",
    deps = [
        ":junit-4.12",
        ":library",
    ],
)

java_test(
    name = "test_with_runtime_deps",
    srcs = glob(["src/test/java/**/*.java"]),
    test_class = "com.example.UseJunit412",
    runtime_deps = [":junit-4.12"],
    deps = [
        ":junit-4.12",
        ":library",
    ],
)
