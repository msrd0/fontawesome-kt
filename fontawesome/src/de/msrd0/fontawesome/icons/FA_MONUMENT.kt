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

object FA_MONUMENT: Icon {
	
	override val name get() = "Monument"
	
	override val unicode get() = "f5a6"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M180.7 4.686C186.9-1.562 197.1-1.562 203.3 4.686L283.3 84.69C285.8 87.2 287.4 90.48 287.9 94.02L328.1 416H55.88L96.12 94.02C96.57 90.48 98.17 87.2 100.7 84.69L180.7 4.686zM152 272C138.7 272 128 282.7 128 296C128 309.3 138.7 320 152 320H232C245.3 320 256 309.3 256 296C256 282.7 245.3 272 232 272H152zM352 448C369.7 448 384 462.3 384 480C384 497.7 369.7 512 352 512H32C14.33 512 0 497.7 0 480C0 462.3 14.33 448 32 448H352z"/></svg>"""
		else -> null
	}
	
}
