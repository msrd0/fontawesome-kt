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

object FA_BABY_CARRIAGE: Icon {
	
	override val name get() = "Baby Carriage"
	
	override val unicode get() = "f77d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M255.1 192H.1398C2.741 117.9 41.34 52.95 98.98 14.1C112.2 5.175 129.8 9.784 138.9 22.92L255.1 192zM384 160C384 124.7 412.7 96 448 96H480C497.7 96 512 110.3 512 128C512 145.7 497.7 160 480 160H448V224C448 249.2 442.2 274.2 430.9 297.5C419.7 320.8 403.2 341.9 382.4 359.8C361.6 377.6 336.9 391.7 309.7 401.4C282.5 411 253.4 416 223.1 416C194.6 416 165.5 411 138.3 401.4C111.1 391.7 86.41 377.6 65.61 359.8C44.81 341.9 28.31 320.8 17.05 297.5C5.794 274.2 0 249.2 0 224H384L384 160zM31.1 464C31.1 437.5 53.49 416 79.1 416C106.5 416 127.1 437.5 127.1 464C127.1 490.5 106.5 512 79.1 512C53.49 512 31.1 490.5 31.1 464zM416 464C416 490.5 394.5 512 368 512C341.5 512 320 490.5 320 464C320 437.5 341.5 416 368 416C394.5 416 416 437.5 416 464z"/></svg>"""
		else -> null
	}
	
}

val FA_CARRIAGE_BABY = FA_BABY_CARRIAGE
