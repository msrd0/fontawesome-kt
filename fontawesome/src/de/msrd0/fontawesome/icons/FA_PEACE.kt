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

/** Peace */
object FA_PEACE: Icon {
	
	override val name get() = "Peace"
	
	override val unicode get() = "f67c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM224 445.1c-36.36-6.141-69.2-22.48-95.59-46.04L224 322.6V445.1zM288 322.6l95.59 76.47C357.2 422.6 324.4 438.1 288 445.1V322.6zM64 256c0-94.95 69.34-173.8 160-189.1v173.7l-135.7 108.6C72.86 321.6 64 289.8 64 256zM423.7 349.2L288 240.6V66.89C378.7 82.2 448 161.1 448 256C448 289.8 439.1 321.6 423.7 349.2z"/></svg>"""
		else -> null
	}
	
}
