/**
 * PermissionsEx
 * Copyright (C) zml and PermissionsEx contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ninja.leaping.permissionsex.util;

import java.util.function.Predicate;

/**
 * A predicate that filters based on case-insensitive starts with
 */
public class StartsWithPredicate implements Predicate<String> {
    private final String test;

    public StartsWithPredicate(String test) {
        this.test = test;
    }

    @Override
    public boolean test(String input) {
        return input != null && input.toLowerCase().startsWith(test.toLowerCase());
    }
}
