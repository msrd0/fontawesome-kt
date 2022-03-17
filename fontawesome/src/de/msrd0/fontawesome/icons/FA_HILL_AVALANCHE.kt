/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Hill Avalanche */
object FA_HILL_AVALANCHE: Icon {
	
	override val name get() = "Hill Avalanche"
	
	override val unicode get() = "e507"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M161.4 91.58C160.5 87.87 160 83.99 160 80C160 53.49 181.5 32 208 32C229.9 32 248.3 46.62 254.1 66.62C268.5 45.7 292.7 32 320 32C364.2 32 400 67.82 400 112C400 119.4 398.1 126.6 397.1 133.5C426.9 145.1 448 174.1 448 208C448 236.4 433.2 261.3 410.9 275.5L492.6 357.2C508.2 372.8 533.6 372.8 549.2 357.2C564.8 341.6 564.8 316.2 549.2 300.6C533.6 284.1 508.2 284.1 492.6 300.6L458.7 266.7C493 232.3 548.8 232.3 583.1 266.7C617.5 301 617.5 356.8 583.1 391.1C552.8 421.4 505.9 425 471.7 401.9L161.4 91.58zM512 64C512 81.67 497.7 96 480 96C462.3 96 448 81.67 448 64C448 46.33 462.3 32 480 32C497.7 32 512 46.33 512 64zM480 160C480 142.3 494.3 128 512 128C529.7 128 544 142.3 544 160C544 177.7 529.7 192 512 192C494.3 192 480 177.7 480 160zM456.1 443.7C482.2 468.9 464.3 512 428.7 512H112C67.82 512 32 476.2 32 432V115.3C32 79.68 75.09 61.83 100.3 87.03L456.1 443.7z"/></svg>"""
		else -> null
	}
	
}
