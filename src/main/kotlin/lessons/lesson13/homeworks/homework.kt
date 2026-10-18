fun averageTestTime(times: Map<String, Double>): Double =
    times.values.average()

fun allTestMethods(metadata: Map<String, String>): List<String> =
    metadata.keys.toList()

fun addTestResult(results: MutableMap<String, String>, testName: String, result: String) {
    results[testName] = result
}

fun countPassed(results: Map<String, String>): Int =
    results.count { it.value == "passed" }

fun removeFixedBug(bugs: MutableMap<String, String>, bugName: String) {
    bugs.remove(bugName)
}

fun printPageStatuses(pages: Map<String, String>) {
    pages.forEach { (url, status) -> println("Страница $url: $status") }
}

fun slowServices(times: Map<String, Int>, threshold: Int): Map<String, Int> =
    times.filterValues { it > threshold }

fun statusOrUnknown(apiResults: Map<String, String>, endpoint: String): String =
    apiResults.getOrDefault(endpoint, "не протестирован")

fun browserType(config: Map<String, String>): String =
    config.getValue("browserType")

fun withNewVersion(versions: Map<String, String>, key: String, value: String): Map<String, String> =
    versions + (key to value)

fun deviceSettings(settings: Map<String, String>, model: String, default: String): String =
    settings.getOrElse(model) { default }

fun hasError(errors: Map<Int, String>, code: Int): Boolean =
    errors.containsKey(code)

fun filterByVersion(results: Map<String, String>, version: String): Map<String, String> =
    results.filterKeys { it.contains(version) }

fun hasFailedModules(results: Map<String, String>): Boolean =
    results.containsValue("failed")

fun mergeSettings(target: MutableMap<String, String>, source: Map<String, String>) {
    target.putAll(source)
}

fun mergeBugMaps(a: Map<Int, String>, b: Map<Int, String>): Map<Int, String> =
    a + b

fun clearRunData(data: MutableMap<String, String>) {
    data.clear()
}

fun withoutSkipped(report: Map<String, String>): Map<String, String> =
    report.filterValues { it != "skipped" }

fun withoutConfigs(configs: Map<String, String>, toRemove: List<String>): Map<String, String> =
    configs - toRemove

fun buildReport(results: Map<String, String>): List<String> =
    results.map { (id, result) -> "Test ID: $id — $result" }

fun archive(results: MutableMap<String, String>): Map<String, String> =
    results.toMap()

fun stringifyIds(times: Map<Int, Double>): Map<String, Double> =
    times.mapKeys { it.key.toString() }

fun boostBy10Percent(perf: Map<String, Double>): Map<String, Double> =
    perf.mapValues { it.value * 1.1 }

fun isCompileErrorsEmpty(errors: Map<Int, String>): Boolean =
    errors.isEmpty()

fun hasLoadResults(results: Map<String, Double>): Boolean =
    results.isNotEmpty()

fun allPassed(results: Map<String, String>): Boolean =
    results.all { it.value == "passed" }

fun anyFailed(results: Map<String, String>): Boolean =
    results.any { it.value == "failed" }

fun failedOptional(results: Map<String, String>): Map<String, String> =
    results.filter { (name, status) ->
        status != "passed" && name.contains("optional")
    }

