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

/** Scale unbalanced */
object FA_SCALE_UNBALANCED: Icon {
	
	override val name get() = "Scale unbalanced"
	
	override val unicode get() = "f515"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M85 250.5c-87 174.2-84.1 165.9-84.1 181.5C.0035 476.1 57.25 512 128 512s128-35.88 128-79.1c0-16.12 1.375-8.752-85.12-181.5C153.3 215.3 102.8 215.1 85 250.5zM55.96 416l71.98-143.1l72.15 143.1H55.96zM554.9 122.5c-17.62-35.25-68.08-35.37-85.83 0c-87 174.2-85.04 165.9-85.04 181.5c0 44.12 57.25 79.1 128 79.1s127.1-35.87 127.1-79.1C639.1 287.9 641.4 295.3 554.9 122.5zM439.1 288l72.04-143.1l72.08 143.1H439.1zM495.1 448h-143.1V153.3c20.83-9.117 36.72-26.93 43.78-48.77l126.3-42.11c16.77-5.594 25.83-23.72 20.23-40.48c-5.578-16.73-23.62-25.86-40.48-20.23l-113.3 37.76c-13.94-23.49-39.29-39.41-68.58-39.41c-44.18 0-79.1 35.82-79.1 80c0 2.961 .5587 5.771 .8712 8.648L117.9 129.7C101.1 135.3 92.05 153.4 97.64 170.1c4.469 13.41 16.95 21.88 30.36 21.88c3.344 0 6.768-.5186 10.13-1.644L273.8 145.1C278.2 148.3 282.1 151.1 288 153.3V496C288 504.8 295.2 512 304 512h223.1c8.838 0 16-7.164 16-15.1C543.1 469.5 522.5 448 495.1 448z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SCALE_UNBALANCED]. */
val FA_BALANCE_SCALE_LEFT = FA_SCALE_UNBALANCED
