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

object FA_PERSON_RAYS: Icon {
	
	override val name get() = "Person Rays"
	
	override val unicode get() = "e54d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M304 48C304 74.51 282.5 96 256 96C229.5 96 208 74.51 208 48C208 21.49 229.5 0 256 0C282.5 0 304 21.49 304 48zM248 352V480C248 497.7 233.7 512 216 512C198.3 512 184 497.7 184 480V256.9L155.4 304.5C146.3 319.6 126.7 324.5 111.5 315.4C96.37 306.3 91.47 286.7 100.6 271.5L158.8 174.6C176.2 145.7 207.4 128 241.1 128H270.9C304.6 128 335.8 145.7 353.2 174.6L411.4 271.5C420.5 286.7 415.6 306.3 400.5 315.4C385.3 324.5 365.7 319.6 356.6 304.5L328 256.9V480C328 497.7 313.7 512 296 512C278.3 512 264 497.7 264 480V352L248 352zM7.029 7.029C16.4-2.343 31.6-2.343 40.97 7.029L120.1 87.03C130.3 96.4 130.3 111.6 120.1 120.1C111.6 130.3 96.4 130.3 87.03 120.1L7.029 40.97C-2.343 31.6-2.343 16.4 7.029 7.029V7.029zM471 7.029C480.4-2.343 495.6-2.343 504.1 7.029C514.3 16.4 514.3 31.6 504.1 40.97L424.1 120.1C415.6 130.3 400.4 130.3 391 120.1C381.7 111.6 381.7 96.4 391 87.03L471 7.029zM7.029 471L87.03 391C96.4 381.7 111.6 381.7 120.1 391C130.3 400.4 130.3 415.6 120.1 424.1L40.97 504.1C31.6 514.3 16.4 514.3 7.029 504.1C-2.343 495.6-2.343 480.4 7.029 471V471zM391 424.1C381.7 415.6 381.7 400.4 391 391C400.4 381.7 415.6 381.7 424.1 391L504.1 471C514.3 480.4 514.3 495.6 504.1 504.1C495.6 514.3 480.4 514.3 471 504.1L391 424.1z"/></svg>"""
		else -> null
	}
	
}
