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

/** Person Cane */
object FA_PERSON_CANE: Icon {
	
	override val name get() = "Person Cane"
	
	override val unicode get() = "e53c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M240 48C240 74.51 218.5 96 192 96C165.5 96 144 74.51 144 48C144 21.49 165.5 0 192 0C218.5 0 240 21.49 240 48zM232 480C232 497.7 217.7 512 200 512C182.3 512 168 497.7 168 480V352H152V480C152 497.7 137.7 512 120 512C102.3 512 88 497.7 88 480V256.9L59.43 304.5C50.33 319.6 30.67 324.5 15.52 315.4C.3696 306.3-4.531 286.7 4.573 271.5L62.85 174.6C80.2 145.7 111.4 128 145.1 128H181C209.6 128 236.7 140.7 254.9 162.7L328.6 251.6C339.9 265.2 338 285.3 324.4 296.6C310.8 307.9 290.7 306 279.4 292.4L232 235.3L232 480zM320 384C320 397.3 309.3 408 296 408C282.7 408 272 397.3 272 384V376C272 345.1 297.1 320 328 320C358.9 320 384 345.1 384 376V488C384 501.3 373.3 512 360 512C346.7 512 336 501.3 336 488V376C336 371.6 332.4 368 328 368C323.6 368 320 371.6 320 376V384z"/></svg>"""
		else -> null
	}
	
}