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

/** Virus */
object FA_VIRUS: Icon {
	
	override val name get() = "Virus"
	
	override val unicode get() = "e074"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M288 43.55C288 93.44 348.3 118.4 383.6 83.15L391.8 74.98C404.3 62.48 424.5 62.48 437 74.98C449.5 87.48 449.5 107.7 437 120.2L428.9 128.4C393.6 163.7 418.6 224 468.5 224H480C497.7 224 512 238.3 512 256C512 273.7 497.7 288 480 288H468.5C418.6 288 393.6 348.3 428.9 383.6L437 391.8C449.5 404.3 449.5 424.5 437 437C424.5 449.5 404.3 449.5 391.8 437L383.6 428.9C348.3 393.6 288 418.6 288 468.5V480C288 497.7 273.7 512 256 512C238.3 512 224 497.7 224 480V468.5C224 418.6 163.7 393.6 128.4 428.9L120.2 437C107.7 449.5 87.48 449.5 74.98 437C62.48 424.5 62.48 404.3 74.98 391.8L83.15 383.6C118.4 348.3 93.44 288 43.55 288H32C14.33 288 0 273.7 0 256C0 238.3 14.33 224 32 224H43.55C93.44 224 118.4 163.7 83.15 128.4L74.98 120.2C62.48 107.7 62.48 87.48 74.98 74.98C87.48 62.48 107.7 62.48 120.2 74.98L128.4 83.15C163.7 118.4 224 93.44 224 43.55V32C224 14.33 238.3 0 256 0C273.7 0 288 14.33 288 32V43.55zM224 176C197.5 176 176 197.5 176 224C176 250.5 197.5 272 224 272C250.5 272 272 250.5 272 224C272 197.5 250.5 176 224 176zM304 328C317.3 328 328 317.3 328 304C328 290.7 317.3 280 304 280C290.7 280 280 290.7 280 304C280 317.3 290.7 328 304 328z"/></svg>"""
		else -> null
	}
	
}
