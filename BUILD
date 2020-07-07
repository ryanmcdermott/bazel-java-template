load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "template_lib",
    srcs = glob(["src/main/java/com/example/template/*.java"]),
    deps = ["@maven//:com_google_guava_guava"],
)

java_binary(
    name = "template_bin",
    main_class = "com.example.template.Main",
    runtime_deps = [":template_lib"],
)

java_test(
    name = "template_lib_test",
    srcs = glob(["src/test/java/com/example/template/StringRepeaterTest.java"]),
    test_class = "com.example.template.StringRepeaterTest",
    deps = [
        ":template_lib",
        "@maven//:com_google_guava_guava",
        "@maven//:junit_junit",
    ],
)