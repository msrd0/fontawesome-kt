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
import de.msrd0.fontawesome.Style.BRANDS

object FA_VAADIN: Icon {
	
	override val name get() = "Vaadin"
	
	override val unicode get() = "f408"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M224.5 140.7c1.5-17.6 4.9-52.7 49.8-52.7h98.6c20.7 0 32.1-7.8 32.1-21.6V54.1c0-12.2 9.3-22.1 21.5-22.1S448 41.9 448 54.1v36.5c0 42.9-21.5 62-66.8 62H280.7c-30.1 0-33 14.7-33 27.1 0 1.3-.1 2.5-.2 3.7-.7 12.3-10.9 22.2-23.4 22.2s-22.7-9.8-23.4-22.2c-.1-1.2-.2-2.4-.2-3.7 0-12.3-3-27.1-33-27.1H66.8c-45.3 0-66.8-19.1-66.8-62V54.1C0 41.9 9.4 32 21.6 32s21.5 9.9 21.5 22.1v12.3C43.1 80.2 54.5 88 75.2 88h98.6c44.8 0 48.3 35.1 49.8 52.7h.9zM224 456c11.5 0 21.4-7 25.7-16.3 1.1-1.8 97.1-169.6 98.2-171.4 11.9-19.6-3.2-44.3-27.2-44.3-13.9 0-23.3 6.4-29.8 20.3L224 362l-66.9-117.7c-6.4-13.9-15.9-20.3-29.8-20.3-24 0-39.1 24.6-27.2 44.3 1.1 1.9 97.1 169.6 98.2 171.4 4.3 9.3 14.2 16.3 25.7 16.3z"/></svg>"""
		else -> null
	}
	
}
