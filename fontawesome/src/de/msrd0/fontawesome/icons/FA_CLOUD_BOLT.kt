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

/** Cloud bolt */
object FA_CLOUD_BOLT: Icon {
	
	override val name get() = "Cloud bolt"
	
	override val unicode get() = "f76c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M352 351.1h-71.25l47.44-105.4c3.062-6.781 1.031-14.81-4.906-19.31c-5.969-4.469-14.22-4.312-19.94 .4687l-153.6 128c-5.156 4.312-7.094 11.41-4.781 17.72c2.281 6.344 8.281 10.56 15.03 10.56h71.25l-47.44 105.4c-3.062 6.781-1.031 14.81 4.906 19.31C191.6 510.9 194.1 512 198.4 512c3.656 0 7.281-1.25 10.25-3.719l153.6-128c5.156-4.312 7.094-11.41 4.781-17.72C364.8 356.2 358.8 351.1 352 351.1zM416 128c-.625 0-1.125 .25-1.625 .25C415.5 123 416 117.6 416 112C416 67.75 380.3 32 336 32c-24.62 0-46.25 11.25-61 28.75C256.4 24.75 219.3 0 176 0C114.1 0 64 50.13 64 112c0 7.25 .75 14.25 2.125 21.25C27.75 145.8 0 181.5 0 224c0 53 43 96 96 96h46.63l140.2-116.8c8.605-7.195 19.53-11.16 30.76-11.16c10.34 0 20.6 3.416 29.03 9.734c17.96 13.61 24.02 37.45 14.76 57.95L330.2 320H416c53 0 96-43 96-96S469 128 416 128z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_CLOUD_BOLT]. */
val FA_THUNDERSTORM = FA_CLOUD_BOLT
